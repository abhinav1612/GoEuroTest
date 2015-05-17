###############################################################
###													
###	              GoEuro Test APP	                        
###          ---------------------------                       
###															
###############################################################

1. The System.out.println() statements used in the code-base to track the execution of Application will be replaced with Logger (to log the activity) in real world application.	
2. You need to pass a Single argument (city_name) to run this app, and it will create the CSV file next to your jar
3. In case no details are found for input city_name, then a CSV file with just header record will be created.
4. The Output File will follow given naming convention Extract_${cityName}_${timestamp}.csv. (Sample FileName:- Extract_berlin_16052015_2040277.csv )
5. MAX_RETRY_ATTEMPTS parameter represents number of retry attempts that will be made in scenarios when given web service has limited availability.
   Example : Due to poor Internet connectivity, this feature will make web-service request again for a fixed number of times in a same call.
6. Set JAVA_HOME to Java 7.
7. To Execute the jar
java -jar GoEuroTest.jar CITY_NAME