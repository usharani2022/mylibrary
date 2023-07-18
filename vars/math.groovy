def newGit(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}
def newBuild()
{
   sh 'mvn package'
}


