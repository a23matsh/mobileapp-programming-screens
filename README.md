
# Rapport

Added a second activity as an empty views activity by right clicking the files in the left bar and choosing new. Then a button identified by 
"buttonToStartSecondActivity" was programmed in the main activity to start the second activity. When the button is clicked it triggers the
listener attached to it and an intent is created that handles a transition from the main activity to the  second acitivty. Then two pieces of extra data is added to the intent bundle
"MessageTest" which is a string and "number" which is an integer, that pass data from the main activity to the second activity. Two widgets as textviews have been added
to the Second Activity named TextView & TextView 2. 

The following snippet of code shows how the program retrieves the intent extras. It retrieves a bundle of extras from the intent that started the activity.
If the extras is not equal to null it proceeds to retrieving a string and an integer from the bundle using specific keys. The two different textviews are then identified
by their assigned ID's and will then print out "Hej detta är test" and the number "100", since this is what is assigned to them when retrieved, in the main activity.


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        // Retrieving the intent extras
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("MessageTest");
            int number = extras.getInt("number");
            TextView textView = findViewById(R.id.textView);
            TextView textView2 = findViewById(R.id.textView2);
            textView.setText(name);
            textView2.setText("" + number);

There is also a screenshot attached that shows the displayed outcome when pressing the "buttonToStartSecondActivity".



![](Screenshot_Screens2.png)


Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
