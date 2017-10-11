package sawari.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


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

        Button button = (Button)view.findViewById(R.id.displayBottomButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = ((TextView)view.findViewById(R.id.displayTextBottom));
                text.setText(message);
            }
        });
        return view;
    }

}
