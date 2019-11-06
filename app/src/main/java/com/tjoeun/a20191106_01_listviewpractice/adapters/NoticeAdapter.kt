package com.tjoeun.a20191106_01_listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.a20191106_01_listviewpractice.R
import com.tjoeun.a20191106_01_listviewpractice.datas.NoticeData

class NoticeAdapter(context:Context, resource:Int, list:ArrayList<NoticeData>)
    : ArrayAdapter<NoticeData> (context, R.layout.notice_list_item, list) {


    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    constructor(context: Context, list: ArrayList<NoticeData>)
            : this(context, R.layout.notice_list_item, list)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.notice_list_item, null)
        }
//        tempRow가 null인 경우를 대비했으니, row에 tempRow는 절대 null 아니라고 하면서 대입.
        var row = tempRow!!

//        근거 데이터 변수 추출
        var data = mList.get(position)

//        각 줄에서 데이터를 출력할 View 찾아오기
        var titleTxt = row.findViewById<TextView>(R.id.titleTxt)
        var dateTxt = row.findViewById<TextView>(R.id.dateTxt)
        var contentTxt = row.findViewById<TextView>(R.id.contentTxt)

//        View / Data를 연결
        titleTxt.text = data.title
        dateTxt.text = data.date
        contentTxt.text = data.content

        return row
    }



}