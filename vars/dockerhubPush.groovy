#!/usr/bin/env groovy

def call ( String buildresult){
  sh 'docker login -u ${USERNAME} -p ${PASSWORD}'
  sh 'docker push ${IMAGE_NAME}:${IMAGE_TAG}'
  slackSend color: "danger", message: "BAD NEWS:Job ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its result was unclear ! more info ${env.BUILD_URL}"
}
