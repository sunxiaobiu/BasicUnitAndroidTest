import android.app.ExpandableListActivity;
import android.widget.ExpandableListAdapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizlog_triplog_648232404 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ExpandableListActivity.class);
      Object var1 = EasyMock.createMock(ExpandableListAdapter.class);
      ((ExpandableListActivity)var2).setListAdapter((ExpandableListAdapter)var1);
   }
}
