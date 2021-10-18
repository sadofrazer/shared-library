#!/usr/bin/env groovy
    script{
      sh'''
         docker login -u ${USERNAME} -p ${PASSWORD}
         docker push ${IMAGE_NAME}:${IMAGE_TAG}
      '''
    }
