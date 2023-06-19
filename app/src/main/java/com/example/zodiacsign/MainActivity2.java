package com.example.zodiacsign;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String zodiac = intent.getStringExtra("zodiac");
        int zodiacYear = intent.getIntExtra("zodiacYear", 0);

        textView.setText( zodiacYear +" is year of : " + zodiac);



        Button backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(view -> {
            Intent back = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(back);
        });

        //converting into lower case for easier access in conditional.
        String newZodiac = zodiac.toLowerCase();


        ImageView img = findViewById(R.id.image);
        TextView txtDescription = findViewById(R.id.description);



        switch(newZodiac){
            case "rat":
                img.setImageResource(R.drawable.rat);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac )+" The Year of the Rat, which is the first animal in the Chinese zodiac, represents a time of new beginnings and opportunities for growth and success. People born in this year are thought to possess qualities such as intelligence, adaptability, and a talent for problem-solving, which can help them navigate the challenges of life and achieve their goals. Additionally, the rat is a symbol of wealth and prosperity, suggesting that this year may be particularly favorable for financial growth and success. Overall, the Year of the Rat is seen as a time of optimism and possibility, offering the potential for personal and professional advancement.");
                break;

            case "ox":
                img.setImageResource(R.drawable.ox);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Ox is the second animal in the 12-year cycle of the Chinese zodiac and is associated with hard work, diligence, and reliability. Those born in the Year of the Ox are believed to possess these qualities, as well as being honest, patient, and methodical. While they may not be the most social or outgoing individuals, they are respected for their calm and steadfast nature. The Year of the Ox is seen as a time for building and laying strong foundations, as well as for persistence and determination in achieving one's goals.");
                break;

            case "tiger":
                img.setImageResource(R.drawable.tiger);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac)+" The Year of the Tiger is the third animal in the 12-year cycle of the Chinese zodiac and is associated with courage, passion, and unpredictability. Those born in the Year of the Tiger are believed to possess these traits, as well as being confident, independent, and competitive. They are often natural leaders, unafraid to take risks and pursue their goals with determination. However, they may also have a tendency towards impulsiveness and a quick temper. The Year of the Tiger is seen as a time for embracing change, taking bold action, and seizing opportunities, while also remaining aware of potential risks and challenges.");
                break;

            case "rabbit":
                img.setImageResource(R.drawable.rabbit);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac)+ " The Year of the Rabbit is the fourth animal in the 12-year cycle of the Chinese zodiac and is associated with gentleness, kindness, and harmony. Those born in the Year of the Rabbit are believed to possess these traits, as well as being artistic, intuitive, and family-oriented. They value peace and harmony in all aspects of their lives, and are known for their diplomacy and tactfulness. However, they may also be prone to indecisiveness and a tendency towards being overly sensitive. The Year of the Rabbit is seen as a time for focusing on relationships, nurturing creativity and spirituality, and cultivating a sense of inner peace and balance.");
                break;

            case "dragon":
                img.setImageResource(R.drawable.dragon);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Dragon is the fifth animal in the 12-year cycle of the Chinese zodiac and is associated with power, success, and good fortune. Those born in the Year of the Dragon are believed to possess these qualities, as well as being ambitious, confident, and charismatic. They are natural leaders who are not afraid to take risks and pursue their dreams with passion and determination. However, they may also have a tendency towards impatience and arrogance. The Year of the Dragon is seen as a time for embracing change, seizing opportunities, and pursuing one's passions with courage and enthusiasm. It is also considered an auspicious time for starting new ventures or embarking on major life changes.");
                break;

            case "snake":
                img.setImageResource(R.drawable.snake);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac)+ " The Year of the Snake is the sixth animal in the 12-year cycle of the Chinese zodiac and is associated with wisdom, intuition, and transformation. Those born in the Year of the Snake are believed to possess these traits, as well as being mysterious, reserved, and independent. They value privacy and may have a tendency towards being secretive or guarded. However, they are also seen as being highly perceptive and insightful. The Year of the Snake is seen as a time for reflection, self-discovery, and personal growth, as well as for embracing change and transformation.");
                break;

            case "horse":
                img.setImageResource(R.drawable.horse);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Horse is the seventh animal in the 12-year cycle of the Chinese zodiac and is associated with freedom, adventure, and unpredictability. Those born in the Year of the Horse are believed to possess these qualities, as well as being energetic, charismatic, and independent. They are often natural leaders who value their personal freedom and may have a tendency towards restlessness or impatience. The Year of the Horse is seen as a time for taking risks, pursuing new experiences, and embracing one's sense of adventure.");
                break;

            case "ram":
                img.setImageResource(R.drawable.ram);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Ram, also known as the Year of the Goat or the Year of the Sheep, is the eighth animal in the 12-year cycle of the Chinese zodiac and is associated with creativity, kindness, and tranquility. Those born in the Year of the Ram are believed to possess these traits, as well as being artistic, sensitive, and family-oriented. They value peace and harmony in all aspects of their lives and may have a tendency towards shyness or introversion. The Year of the Ram is seen as a time for cultivating one's artistic talents, nurturing relationships, and finding balance and inner peace.");
                break;

            case "monkey":
                img.setImageResource(R.drawable.monkey);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac)+ " The Year of the Monkey is the ninth animal in the 12-year cycle of the Chinese zodiac and is associated with intelligence, creativity, and playfulness. Those born in the Year of the Monkey are believed to possess these qualities, as well as being witty, charming, and adventurous. They are often natural problem-solvers and enjoy a good challenge, but may also have a tendency towards being mischievous or unpredictable. The Year of the Monkey is seen as a time for creativity, innovation, and exploration, as well as for embracing a sense of fun and lightheartedness.");
                break;

            case "rooster":
                img.setImageResource(R.drawable.rooster);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Rooster is the tenth animal in the 12-year cycle of the Chinese zodiac and is associated with confidence, courage, and reliability. Those born in the Year of the Rooster are believed to possess these traits, as well as being outspoken, organized, and punctual. They value hard work and attention to detail, and may have a tendency towards being perfectionistic or critical. The Year of the Rooster is seen as a time for diligence, responsibility, and planning, as well as for speaking up and standing up for oneself and others.");
                break;

            case "dog":
                img.setImageResource(R.drawable.dog);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Dog is the eleventh animal in the 12-year cycle of the Chinese zodiac and is associated with loyalty, honesty, and reliability. Those born in the Year of the Dog are believed to possess these qualities, as well as being protective, trustworthy, and affectionate. They value relationships and may have a tendency towards being cautious or conservative. The Year of the Dog is seen as a time for building strong foundations, fostering deep connections, and demonstrating loyalty and integrity.");
                break;

            case "pig":
                img.setImageResource(R.drawable.pig);
                txtDescription.setText(String.format("%s is year of %s.", zodiacYear, zodiac) + " The Year of the Pig is the twelfth and final animal in the 12-year cycle of the Chinese zodiac and is associated with kindness, generosity, and abundance. Those born in the Year of the Pig are believed to possess these traits, as well as being sociable, optimistic, and easy-going. They value pleasure and comfort and may have a tendency towards indulgence or laziness. The Year of the Pig is seen as a time for enjoying the fruits of one's labor, sharing one's abundance with others, and embracing a sense of joy and celebration.");
                break;

                default:

        }

    }



}
