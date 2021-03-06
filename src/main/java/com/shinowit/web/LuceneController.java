/*
package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoExample;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.NIOFSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wltea.analyzer.lucene.IKAnalyzer;

import javax.annotation.Resource;
import java.io.*;
import java.util.Date;
import java.util.List;

*/
/**
 * Created by daihui on 2015-01-19.
 *//*

@Controller
@RequestMapping("/lucene")
public class LuceneController {


    @Resource
    public TmeMerchandiseinfoMapper merchandiseinfoDAO;

    @RequestMapping(value = "createIndex")
    public void createIndex() throws Exception  {
        File indexDir = new File("E://GitRepository//luceneIndex");
        // File dataDir = new File("E://text//唐家三少");
        Analyzer analyzer = new IKAnalyzer();
        //  File[] dataFiles = dataDir.listFiles();

        TmeMerchandiseinfoExample merchandiseinfoExample=new TmeMerchandiseinfoExample();
        merchandiseinfoExample.createCriteria().andMerchandiseidIsNotNull();
        List<TmeMerchandiseinfo> merchandiseinfoList=merchandiseinfoDAO.selectPage(merchandiseinfoExample);

        // 有文件系统或者内存存储方式,这里使用文件系统存储索引数据
        Directory directory = new NIOFSDirectory(indexDir);

        // 生成全文索引的配置对象
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(Version.LUCENE_4_10_3, analyzer);

        // 设置生成全文索引的方式为创建或者追加
        indexWriterConfig.setOpenMode(IndexWriterConfig.OpenMode.CREATE_OR_APPEND);

        // 创建真正生成全文索引的writer对象
        IndexWriter indexWriter = new IndexWriter(directory, indexWriterConfig);

        long startTime = new Date().getTime();

        for (TmeMerchandiseinfo detail : merchandiseinfoList) {
            Document document = new Document();
//                Reader txtReader = new FileReader(merchandiseinfoList[i]);
            StringField field_filename = new StringField("filename", detail.getMerchandisename(), Field.Store.YES);
            document.add(field_filename);

            TextField txt_content_field = new TextField("content", detail.getPicpath(), Field.Store.YES);

            document.add(txt_content_field);

            indexWriter.addDocument(document);
        }
        indexWriter.commit();
        indexWriter.close();
        long endTime = new Date().getTime();

        System.out.println("It takes " + (endTime - startTime)
                        + " milliseconds to create index for the files in directory "
        );
    }

    public static String getFileReaderContent(String filePath) {
        StringBuffer sb = new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8")); // 指定读取文件的编码格式，要和写入的格式一致，以免出现中文乱码,
            String str = null;
            while ((str = reader.readLine()) != null) {
                sb.append(new String(str.getBytes(), "utf-8"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static void query(int pageSize, int pageIndex, String queryString) throws Exception {

        File indexDir = new File("E://GitRepository//luceneIndex");
        Analyzer analyzer = new IKAnalyzer();
        // 有文件系统或者内存存储方式,这里使用文件系统存储索引数据
        Directory directory = new NIOFSDirectory(indexDir);

        IndexReader indexReader = DirectoryReader.open(directory);

        // 创建搜索类
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);

        QueryParser queryParser = new MultiFieldQueryParser(Version.LUCENE_4_10_3, new String[]{"filename"}, analyzer);
        queryParser.setDefaultOperator(QueryParser.OR_OPERATOR);//多个关键字时采取 or 操作

        Query query = queryParser.parse(queryString + "*");

        int start = (pageIndex - 1) * pageSize;
        int max_result_size = start + pageSize;
        TopScoreDocCollector topDocs = TopScoreDocCollector.create(max_result_size, false);
        indexSearcher.search(query, topDocs);

        int rowCount = topDocs.getTotalHits();  //满足条件的总记录数
        int pages = (rowCount - 1) / pageSize + 1; //计算总页数

        System.out.println("查到的满足查询条件的记录:" + rowCount);

        System.out.println("满足查询条件分页页数:" + pages);

        TopDocs tds = topDocs.topDocs(start, pageSize);
        ScoreDoc[] scoreDoc = tds.scoreDocs;


        // 关键字高亮显示的html标签，需要导入lucene-highlighter-x.x.x.jar
        SimpleHTMLFormatter simpleHTMLFormatter = new SimpleHTMLFormatter("<font color='red'>", "</font>");
        Highlighter highlighter = new Highlighter(simpleHTMLFormatter, new QueryScorer(query));

        for (int i = 0; i < scoreDoc.length; i++) {
            // 内部编号
            int doc_id = scoreDoc[i].doc;
            // logger.debug("内部编号:" + doc_id);

            // 根据文档id找到文档
            Document mydoc = indexSearcher.doc(doc_id);
            // 内容增加高亮显示
            TokenStream tokenStream2 = analyzer.tokenStream("content", new StringReader(mydoc.get("content")));
            String content = highlighter.getBestFragment(tokenStream2, mydoc.get("content"));

            System.out.println("商品名称 ：" + mydoc.get("filename") + " 高亮内容:" + content);

        }

    }

}
*/
