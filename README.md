Solutions has been uploaded into GitHub Repository (https://github.com/farhadali92/qa-automation-challenge).

## How to execute
<code>mvn verify</code>

## Summary of the completed tasks
I was able to complete first two tasks in the challenge and went a little short of time for the third task (mainly due to eclipse failing on me and moving to intellij idea in the middle). 

## Third Task Solution
I could not attempt the third task, however I would have done it as follows:
- We need to navigate to /about/contact-us link
- Look for all the elements which satisfy "//li[@class='office']" xpath and count the office locations which are 37.

## Adopted Strategy
The whole testing framework is structure using Page Object Model design pattern where I separated the assert and selenium communication via different page object for each page in the website.
