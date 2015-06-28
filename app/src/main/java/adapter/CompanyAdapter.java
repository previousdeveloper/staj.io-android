package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import io.staj.stajio.R;
import oauth.Response.CompanyResponse;


public class CompanyAdapter extends ArrayAdapter<CompanyResponse> {
    public CompanyAdapter(Context context, List<CompanyResponse> companyResponseArrayList) {
        super(context, 0, companyResponseArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CompanyResponse companyResponse = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.company_list_adapter, parent, false);
            TextView company_name_textView = (TextView) convertView.findViewById(R.id.company_name);
            company_name_textView.setText(companyResponse.getName());
        }
        return convertView;
    }
}
