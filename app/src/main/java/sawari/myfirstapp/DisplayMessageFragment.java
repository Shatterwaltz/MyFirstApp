package sawari.myfirstapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayMessageFragment extends Fragment {


    public DisplayMessageFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        String message = getArguments().getString(MainActivity.EXTRA_MESSAGE);
        View view = inflater.inflate(R.layout.fragment_display_message, container, false);
        TextView text = ((TextView)view.findViewById(R.id.displayTextTop));
        text.setText(message);
        return view;
    }

}
