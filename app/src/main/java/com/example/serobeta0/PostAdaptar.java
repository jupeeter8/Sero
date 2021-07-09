package com.example.serobeta0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdaptar extends RecyclerView.Adapter<PostAdaptar.ViewHolder> {

    public List<Post> postList;

    public PostAdaptar(List<Post> postList) {
        this.postList = postList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.posti_items, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdaptar.ViewHolder holder, int position) {

        String desc_data = postList.get(position).getDesc();
        String ques_data = postList.get(position).getQues();
        holder.setDescView(desc_data);
        holder.QuesView(ques_data);

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView desc;
        private TextView ques;
        private View mView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mView = itemView;
        }

        public void setDescView(String text){
            desc = mView.findViewById(R.id.postDesc);
            desc.setText(text);
        }

        public void QuesView(String quesText){
            ques = mView.findViewById(R.id.postHead);
            ques.setText(quesText);
        }
    }
}
