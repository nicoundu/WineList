package cl.pingon.winelist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.pingon.winelist.adapters.ListAdapter;
import cl.pingon.winelist.models.Wine;


public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.winelistRv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

       for (int i = 0; i < 6; i++) {
            Wine wine = new Wine();
            wine.setBrand(String.valueOf(i));
            wine.setYears(String.valueOf(i));
            wine.setType(String.valueOf(i));
            wine.save();
        }

        ListAdapter adapter = new ListAdapter();
        recyclerView.setAdapter(adapter);

    }
}
