package com.tjoeun.a20191106_01_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191106_01_listviewpractice.datas.NoticeData
import kotlinx.android.synthetic.main.notice_list_item.*

class NoticeDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice_detail)

        var notice:NoticeData =  intent.getSerializableExtra("notice") as NoticeData

        titleTxt.text = notice.title
        contentTxt.text = notice.content

    }
}
