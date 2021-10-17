#!/usr/bin/env groovy

def call(String IMAGE_NAME, String IMAGE_TAG, String USERNAME, String PASSWORD) {
  script{ 
      sh'''
         docker login -u USERNAME -p PASSWORD
         docker push IMAGE_NAME:IMAGE_TAG
      '''
  }
}
