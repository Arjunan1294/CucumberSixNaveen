$(document).ready(function() {
CucumberHTML.timelineItems.pushArray([
  {
    "id": "0a22a734-ebcd-474d-9fa3-51c6586fcfbe",
    "feature": "Login page feature",
    "scenario": "Login page title",
    "start": 1709485274927,
    "group": 16,
    "content": "",
    "tags": "@login,@smoke,",
    "end": 1709485284348,
    "className": "failed"
  },
  {
    "id": "75324e38-0965-47a7-a60b-c665bc868d17",
    "feature": "Login page feature",
    "scenario": "Login with correct credentials",
    "start": 1709485274929,
    "group": 18,
    "content": "",
    "tags": "@login,@regression,@skip,",
    "end": 1709485285917,
    "className": "failed"
  },
  {
    "id": "3ca45478-811a-47ed-9b38-a019227bd342",
    "feature": "Login page feature",
    "scenario": "Forgot Password link",
    "start": 1709485274828,
    "group": 17,
    "content": "",
    "tags": "@login,@smoke,",
    "end": 1709485285776,
    "className": "failed"
  }
]);
CucumberHTML.timelineGroups.pushArray([
  {
    "id": 16,
    "content": "Thread[TestNG-PoolService-0,5,main]"
  },
  {
    "id": 17,
    "content": "Thread[TestNG-PoolService-1,5,main]"
  },
  {
    "id": 18,
    "content": "Thread[TestNG-PoolService-2,5,main]"
  }
]);
});