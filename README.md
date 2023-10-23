"# JavaCompetency" 

Common requirement: 
• Use Spring Boot
• API should be tested using Postman 
• Test Cases are required
• Upload in your Github account; add Readme files for each project with instructions of how to 
build, execute and sample request, response.

1 . Assignment - 1 

1. Hello <name>!! (Only Backend) 
Description: Given name in request, return greet at Hello <name>
Conditions: 
• Pay attention to requirement (sample request/response)
Sample Request - Response:
Request: GET /greetapi/v1/hello
Response: { Hello World!! }
Request: GET /greetapi/v1/hello?name=Yogesh
Response: { Hello Yogesh!! }
----------------------------------------------------------------------------------------------------------------------------------------
2. Rest API Based Calculator (Only Backend) 
Description: Provide API base calculator to support operations Addition, Subtraction, Multiplication, 
Division, Square, Square root, factorial, min-max 
Conditions: 
• Pay attention to requirement (sample request/response) 
Sample Request - Response:
Request: GET /calculatorapi/v1/addition?number1=12&number2=15 
Response: { "answer": 27, "detail": "12 + 15 = 27" } 
Request: GET /calculatorapi/v1/subtraction?number1=12&number2=15 
Response: { "answer": -3, "detail": "12 - 15 = -3" } 
Request: GET /calculatorapi/v1/multiplication?number1=12&number2=15 
Response: { "answer": 180, "detail": "12 * 15 = 180" } 
Request: GET /calculatorapi/v1/division?number1=12&number2=15 
Response: { "answer": 0.8, "detail": "12 / 15 = 0.8" } 
Request: GET /calculatorapi/v1/square/{5} 
Response: { "answer": 25, "detail": "square of 5 = 25" } 
Request: GET /calculatorapi/v1/squareroot/{225} 
Response: { "answer": 15, "detail": "squareroot of 225 = 15" } 
Request: GET /calculatorapi/v1/factorial/{5} 
Response: { "answer": 120, "detail": "5! = 120" } 
Request: POST /calculatorapi/v1/min-max 
Body { "numbers" : [10,-5,7,15,-7,-6,16,19,-15,9] } 
Response: { "min": -15, "max": 19 }

------------------------------------------------------------------------------------------------------------------------------


