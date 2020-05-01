package com.sharhan.pdfviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfOpener extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_opener);
        myPDFViewer=(PDFView)findViewById(R.id.pdfViewer);
        String getItem=getIntent().getStringExtra("pdfFileName");
        if(getItem.equals("CN lab"))
        {
            myPDFViewer.fromAsset("CSE_CN_LAB_MANUAL-16CS602.pdf").load();
        }
        if(getItem.equals("Sharhan"))
        {
            myPDFViewer.fromAsset("Mohammed Sharhan 902742.pdf").load();
        }
        if(getItem.equals("Cisco"))
        {
            myPDFViewer.fromAsset("MohammedSharhan-Cisco_ISTE_Natio-certificate.pdf").load();
        }
        if(getItem.equals("Unix"))
        {
            myPDFViewer.fromAsset("unix.pdf").load();
        }
        if(getItem.equals("Unix1"))
        {
            myPDFViewer.fromAsset("unix1.pdf").load();
        }

    }
}
