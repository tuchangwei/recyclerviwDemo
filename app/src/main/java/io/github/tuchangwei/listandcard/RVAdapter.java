package io.github.tuchangwei.listandcard;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vale on 6/18/15.
 */
public class RVAdapter extends RecyclerView.Adapter {

    List<Person> persons;

    public RVAdapter(List<Person> persons) {

        this.persons = persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.itme,parent,false);

        return new PersonViewHolder(item);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        PersonViewHolder personViewHolder = (PersonViewHolder)holder;
        Person person = persons.get(position);
        personViewHolder.personPhotoImgView.setImageResource(person.photoID);
        personViewHolder.personNameTextView.setText(person.name);
        personViewHolder.personAgeTextView.setText(person.age);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }


    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        ImageView personPhotoImgView;
        TextView personNameTextView;
        TextView personAgeTextView;
        PersonViewHolder(View view) {
            super(view);
            personPhotoImgView = (ImageView)view.findViewById(R.id.person_photo);
            personNameTextView = (TextView)view.findViewById(R.id.person_name);
            personAgeTextView = (TextView)view.findViewById(R.id.person_age);
        }
    }
}
