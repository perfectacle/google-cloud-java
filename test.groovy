def get_branches(String project) {
    def response = String.format("git ls-remote -h git@github.com:leisureq/%s.git", project).execute()
    def heads = []
    def result = []
    response.text.eachLine {heads.add(it)}
    for(i in heads)
        result.add(i.split()[1].replaceAll('\\^\\{\\}', '').replaceAll('refs/heads/', ''))

    result = result.unique()
    return result
}

def get_tags(String project) {
    def response = String.format("git ls-remote -t git@github.com:leisureq/%s.git", project).execute()
    def result = []
    response.text.eachLine {
        def tag = it.split()[1].replaceAll('\\^\\{\\}', '').replaceAll('refs/tags/', '')
        result.add(tag)
    }

    result = result.sort().reverse()

    result = result.unique()
    return result
}

def tags = get_tags(project)
if(tags.size() > 10) tags = tags[0..10]

def branches = get_branches(project)

def result = []
result.addAll(branches)
result.addAll(tags)

return result
