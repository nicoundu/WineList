package cl.pingon.winelist.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.List;

import cl.pingon.winelist.R;
import cl.pingon.winelist.data.Queries;
import cl.pingon.winelist.models.Wine;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Wine> wines = new Queries().wines();


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_wine, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Wine wine = wines.get(position);
        holder.editTextBrand.setText(wine.getBrand());
        holder.editTextYear.setText(wine.getYears());
        holder.editTextType.setText(wine.getType());

        holder.editTextBrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.editTextType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        holder.editTextYear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {

        return wines.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private EditText editTextBrand;
        private EditText editTextYear;
        private EditText editTextType;

        public ViewHolder(View itemView) {
            super(itemView);

            editTextBrand = itemView.findViewById(R.id.brandEt);
            editTextType = itemView.findViewById(R.id.typeEt);
            editTextYear = itemView.findViewById(R.id.yearsEt);

        }
    }

}
