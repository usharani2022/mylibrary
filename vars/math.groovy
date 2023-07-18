def newGit(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}
def newBuild()
{
   sh 'mvn package'
}
def newDeploy(jobname,ipadress,content)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/{content}.war cameluser@{$ipadress}:/var/lib/tomcat9/webapps/{content}.war"
}


