package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<E extends ListDiffInterface<E>> extends DiffUtil.ItemCallback<E>{


    public boolean theSameAs(@NonNull E newItem) {
        return this.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areItemsTheSame(@NonNull E oldItem, @NonNull E newItem) {
        return theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull E oldItem, @NonNull E newItem) {
        return oldItem.equals(newItem);
    }
}