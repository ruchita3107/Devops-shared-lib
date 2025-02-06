def call(ip,warName,credId){
  sshPublisher(publishers: [sshPublisherDesc(configName: 'tomcat10', transfers: [sshTransfer(cleanRemote: false, excludes: '', execCommand: '''/opt/tomcat10/bin/shutdown.sh
/opt/tomcat10/bin/startup.sh''', execTimeout: 120000, flatten: false, makeEmptyDirs: false, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: '/opt/tomcat10/webapps', remoteDirectorySDF: false, removePrefix: '/target', sourceFiles: '/target/*.war')], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false)])
  
       }
            
