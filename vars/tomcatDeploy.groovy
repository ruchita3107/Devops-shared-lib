def call(ip,warName,credId){
  sshagent(["${credId}}) {
   sh "scp target/${warName}.war ec2-user@${ip}:/opt/tomcat10/webapps" 
   sh "ssh ec2-user@${ip} /opt/tomcat10/bin/shutdown.sh"
   sh "ssh ec2-user@${ip} /opt/tomcat10/bin/startup.sh" 
       }
            }
