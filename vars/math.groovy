def newGit(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}
def newBuild()
{
   sh 'mvn package'
}
def newDeploy(jobname,ipadress,context)
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war cameluser@{$ipadress}:/var/lib/tomcat9/webapps/{context}.war"
}


