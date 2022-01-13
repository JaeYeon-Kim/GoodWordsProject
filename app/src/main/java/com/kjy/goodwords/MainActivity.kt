package com.kjy.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.kjy.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 명언 랜덤 리스트 만들어주기
        val sentenceList = mutableListOf<String>()

        sentenceList.add("신은 용기있는 자를 결코 버리지 않는다.")
        sentenceList.add("삶이 있는 한 희망은 있다. ")
        sentenceList.add("피할 수 없으면 즐겨라 ")
        sentenceList.add("한번의 실패와 영원한 실패를 혼동하지 마라. ")
        sentenceList.add("계단을 밟아야 계단위에 올라설 수 있다.")
        sentenceList.add("오랫동안 꿈을 그리는 사람은 마침내 그 꿈을 닮아 간다.")
        sentenceList.add("성공의 비결은 단 한가지 잘할 수 있 일에 광적으로 집중하는 것이다.")
        sentenceList.add("자신감 있는 표정을 지으면 자신감이 생긴다. ")
        sentenceList.add("평생 살 것 처럼 꿈을 꾸어라. 그리고 내일 죽을것 처럼 오늘을 살아라.")
        sentenceList.add("1퍼센트의 가능성 그것이 나의 길이다. ")

        Log.d("MainActivity", sentenceList.random())



        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {

            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }
        binding.goodWordTextArea.setText(sentenceList.random())
    }
}