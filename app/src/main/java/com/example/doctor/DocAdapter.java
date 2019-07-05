package com.example.doctor;

/*class DocAdapter (val list: List<String>, val datas:String) : RecyclerView.Adapter<DocAdapter.ViewHolder>() {

        companion object {
        const val TAG = "SimpleAdapter"
        }
        override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        Log.d(TAG, "onCreateViewHolder")
        val view = LayoutInflater.from(viewGroup.context)
        .inflate(R.layout.item_view, viewGroup, false)
        return ViewHolder(view, datas)
        }

        override fun getItemCount(): Int = list.count()

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int){
        Log.d(TAG,"onBindViewHolder $position")
        viewHolder.bind(list[position])
        }

class ViewHolder(val view: View, val datas:String) : RecyclerView.ViewHolder(view) {

        val textView = view.findViewById<TextView>(R.id.textView)

        init {
        view.setOnClickListener {
        var time = datas+"/"+textView.text

        if(avalTime.contains(time)){
        avalTime.remove(time)
        textView.setTextColor(Color.BLACK)
        } else{
        avalTime.add(time)
        textView.setTextColor(Color.RED)
        }
        }
        }
        fun bind(text: String) {
        Log.d(TAG, "text: $text")
        val textView = view.findViewById<TextView>(R.id.textView)
        textView.text = text
        if(avalTime.contains(datas+"/"+text)) {
        textView.setTextColor(Color.RED)
        }else{
        textView.setTextColor(Color.BLACK)
        }
        }

        }

        }*/
