package sawari.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayMessageBottomFragment extends Fragment {


    public DisplayMessageBottomFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final String message = getArguments().getString(MainActivity.EXTRA_MESSAGE);
        final View view = inflater.inflate(R.layout.fragment_display_message_bottom, container, false);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView text = ((TextView)view.findViewById(R.id.displayTextBottom));
                TextView buttonText = ((TextView)view.findViewById(R.id.buttonPressedText));
                text.setText(message);
                buttonText.setText("You have pressed "+((Button)v).getText());
            }
        };
        Button button1 = (Button)view.findViewById(R.id.button1);
        button1.setOnClickListener(listener);
        Button button2 = (Button)view.findViewById(R.id.button2);
        button2.setOnClickListener(listener);
        Button button3 = (Button)view.findViewById(R.id.button3);
        button3.setOnClickListener(listener);
        return view;
    }

}
