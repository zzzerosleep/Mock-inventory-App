Edits made:

Part C)<br>
Mainscreen.html<br>
-line 14 changed title of html to "Mike's Bikes"<br>
-line 21 changed heading to "Complete bikes"<br>
-line 53 changed heading to "Individual parts"

Part D)<br>
-Added src/main/resources/templates/about.html and all code in file<br>
-Added src/main/java/com/example/demo/controllers/AboutController.java and all code in file<br>
-added "About us" button to line 19 of mainscreen.html

Part E)<br>
-Added lines 43-99 in src/main/java/com/example/demo/bootstrap/BootStrapData.java to populate Parts<br>
-Added lines 107-116 in src/main/java/com/example/demo/bootstrap/BootStrapData.java to populate Products<br>
-commit SHA for finished step = d15ac80b7273f2d8d0f5c77645e4aec9b6f4db29

Part F)<br>
-Added Buy now button in mainscreen.html line 86<br>
-added src/main/resources/templates/confirmationbuynow.html and all code contained within<br>
-added src/main/resources/templates/buynowerror.html and all code contained within<br>
-added buy function to src/main/java/com/example/demo/controllers/AddProductController.java lines 177-192
-updated commit with the proper part E completion, so parts will bootstrap on app startup<br>


Part G)<br>
src/main/java/com/example/demo/domain/Part.java<br>
-Added lines 48-49 for min/max properties and 91-97 for setters and getters<br><br>
src/main/java/com/example/demo/bootstrap/BootStrapData.java<br>
-Added min/max settings to bootstrap parts lines 49-50,59-60,69-70,79-80,89-90 <br><br>
src/main/resources/templates/mainscreen.html<br>
-added headers for min/max in lines 39-40<br>
-added data to display min/max in lines 49-50<br>
src/main/resources/application.properties<br>
-added lines 14 and 15 to uniquely name database<br><br>
-added src/main/java/com/example/demo/validators/PartValidator.java and src/main/java/com/example/demo/validators/ValidPart.java
to prevent inventory from being outside of min/max settings on parts<br>
-added line 23 to src/main/java/com/example/demo/domain/Part.java annotation for validator<br><br>

Part H<br>
-added src/main/java/com/example/demo/validators/PartMaxValidator.java<br>
-added src/main/java/com/example/demo/validators/PartMinValidator.java<br>
-added src/main/java/com/example/demo/validators/ValidPartMax.java<br>
-added src/main/java/com/example/demo/validators/ValidPartMin.java<br>
-added annotation 24+25 to src/main/java/com/example/demo/domain/Part.java<br>
-added line 15 to src/main/java/com/example/demo/validators/EnufPartsValidator.java to make sure using part on a product does not put below min<br><br>

Part I<br>
-added lines 160-194 in src/test/java/com/example/demo/domain/PartTest.java<br><br>

Part J<br>
-all unused validators have been deleted previously