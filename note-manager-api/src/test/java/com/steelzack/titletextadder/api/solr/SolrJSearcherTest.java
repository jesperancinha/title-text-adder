package com.steelzack.titletextadder.api.solr;

import com.steelzack.titletextadder.api.config.NoteManagerAPIConfigTest;
import com.steelzack.titletextadder.api.config.NoteManagerElasticSearchConfigTest;
import org.apache.solr.common.SolrDocumentList;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {NoteManagerAPIConfigTest.class, NoteManagerElasticSearchConfigTest.class})
public class SolrJSearcherTest {

    @Autowired
    private SolrSearcher solrSearcher;

    @Test
    public void testSearchIsNotNull() {
        Assert.assertNotNull(solrSearcher);
    }

    @Test
    @Ignore
    public void testGetAllFilteredResults() throws Exception {
        final SolrDocumentList results = solrSearcher.getAllFilteredResults("*");
        for (int i = 0; i < results.size(); ++i) {
            System.out.println(results.get(i).get("title"));
            System.out.println(results.get(i).get("title_text"));
        }
    }

}
