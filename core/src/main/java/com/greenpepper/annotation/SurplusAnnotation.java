package com.greenpepper.annotation;

import static com.greenpepper.GreenPepper.$;

import com.greenpepper.Text;

public class SurplusAnnotation implements Annotation
{
    public void writeDown(Text text)
    {
        text.setStyle( Styles.BACKGROUND_COLOR, Colors.RED );
        text.setContent( message() + text.getContent() );
    }
    
    private String message()
    {
        StringBuilder message = new StringBuilder();
        message.append( "<em>" ).append( $( "surplus" ) ).append( "</em> " );
        return message.toString();
    }
}
