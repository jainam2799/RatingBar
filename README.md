# RatingBar

### Introduction

	Rating Bar is used to get rating from the app user. 

	A user can set the rating value by simply touching, dragging or clicking on the stars. 

	In Android, Rating Bar is an extension of Progress Bar and Seek Bar which shows a rating in stars.

	Rating Bar can be of other types too. Custom Rating Bar may have some kind of emojis with different type of face reactions to know the satisfaction level of the user.

### History

	The Rating Bar in Android System was introduced in the very first version of the Android System alongside many other useful components.

•	Platform Version: Android 1.0

•	API Level: 1

•	Version Code: Base

	The Rating Bar is included in “android.support.v7.widget.AppCompatRatingBar”

### Major Methods/Attributes

	getRating(): This public method is used to get the current rating i.e. number of stars filled by the user.

	getNumStars(): This is also a public method but this is used to get the total number of stars in the bar set by the developer. It will return 4 if there are total 4 stars in the rating bar.

	setRating(float rating): This method is used to set a default value to be displayed when the app launches. If you have set the default value as 2.5, then when the app will launch, you will see 2.5 stars filled.

	setOnRatingBarChangeListener( RatingBar.OnRatingBarChangeListener listener ): This sets the listener to be called when the star rating changes. 


### My Demo App

Here I’ve created a sample app just for a brief demo on how the Rating Bar is used.

MainActivity.java code: 





    RatingBar ratingBar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Add in Oncreate() function*/

        // Initiate a Rating Bar
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        // Set Total Number of Stars(Maximum)
        ratingBar.setNumStars(5);

        // Set Default Star Rating when the App Launches
        ratingBar.setRating((float) 2.5);

        // Initiate Button
        button = (Button) findViewById(R.id.button);

        /* Perform Click Event on Button */
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Get Values and Display them in Toast */

                // This gets Total No. of Stars
                String totalNoOfStars = "Total Stars: " +ratingBar.getNumStars();

                // This gets the value of the stars you rated
                String rating = "Your Rating: " +ratingBar.getRating();

                // Displays values in Toast
                Toast.makeText(MainActivity.this, totalNoOfStars + "\n" + rating, Toast.LENGTH_SHORT).show();
            }
        });
    }

#### Here, in my code I have used the following methods/attributes:

*	setNumStars(): This method is used to set the total no. of stars to display in the rating bar. Here, I’ve set the value to 5.

*	setRating(): This method basically sets a default value of star rating and this value is in float. I’ve set the default value to 2.5.

*	setOnCLickListener(): I’ve used a button in the code. On pressing this button, the code will return the value same as no. of stars selected by the user and also display total no. of stars in toast.

*	Android:background: This attribute is simply used to set the background color of the rating bar.

#### How to Use this component:

This component is pretty simple to use.

Rating Bar is used to rate anything; it might be any picture, any feedback or any random thing. 

The user needs to select no. of stars on basis of his/her satisfaction. 

This component is very useful which helps the developer to improve his work because he gets user suggestions.

### The code

The comments are included in the code.

Let’s have a brief look about how my code works.

First step in my code was to initialise the rating bar `ratingBar = (RatingBar) findViewById(R.id.ratingBar);` and the button ` button = (Button) findViewById(R.id.button);`. 

Then I have used setNumStars() `ratingBar.setNumStars(5);` and setRating() `ratingBar.setRating((float) 2.5);`to set total no. of stars and set default value of rating respectively.

My idea of adding a button was simple, the user would choose their rating and then by pressing the button `button.setOnClickListener`, they would see a toast message on the screen which would show them the total no. of stars and the stars they have rated. 

Strings were added to get the total no. stars ` String totalNoOfStars` and the stars that users have selected ` String rating` and Toast was used to display them `Toast.makeText().show();`.

My app has a famous quote by Charlie Chaplin. Below, it has a Rating Bar for the user. And, at the end, it has the button which asks the user to rate the quote.

### References

* Android Developers. Retrieved from “https://developer.android.com/reference/android/widget/RatingBar”

* Abhi Android. Website link “https://abhiandroid.com/”

* Github Inc. “https://github.com/AustinCENG” 
