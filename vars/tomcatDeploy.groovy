def call(ip, warName) {
    sshPublisher(
        publishers: [
            sshPublisherDesc(
                configName: 'tomcat10', 
                transfers: [
                    sshTransfer(
                        cleanRemote: false,  // Don't clean the remote directory before transferring files
                        excludes: '',        // No files excluded
                        execCommand: '''/opt/tomcat10/bin/shutdown.sh
                                        /opt/tomcat10/bin/startup.sh''',  // Shutdown and start Tomcat
                        execTimeout: 120000,  // Timeout for executing commands (2 minutes)
                        flatten: false,       // Keep the directory structure
                        makeEmptyDirs: false, // Don't create empty directories
                        noDefaultExcludes: false, // Use default excludes
                        patternSeparator: '[, ]+', // Pattern separator for file patterns
                        remoteDirectory: '/opt/tomcat10/webapps', // Remote directory where the war file goes
                        remoteDirectorySDF: false, // Don't use a timestamp directory for remote directory
                        removePrefix: '/target',  // Remove '/target' prefix before uploading files
                        sourceFiles: '/target/*.war'  // The source files to upload
                    )
                ],
                usePromotionTimestamp: false, // Don't use promotion timestamp
                useWorkspaceInPromotion: false, // Don't use the workspace in promotion
                verbose: false // Don't enable verbose logging
            )
        ]
    )
}

