package codingwithmitch.com.databindinggettingstarted.databinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import codingwithmitch.com.databindinggettingstarted.R;

public class GlideBindingAdapters {

    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView view, int resource) {

        Context context = view.getContext();
        RequestOptions options = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background);
        Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(resource)
                .into(view);
    }
}
