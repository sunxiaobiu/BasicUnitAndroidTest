import android.app.ExpandableListActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bizlog_triplog_177579678 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ExpandableListActivity.class);
      ((ExpandableListActivity)var1).onContentChanged();
   }
}
