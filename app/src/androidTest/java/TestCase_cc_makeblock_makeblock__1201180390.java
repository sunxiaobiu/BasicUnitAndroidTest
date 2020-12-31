import android.support.v7.widget.RecyclerView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cc_makeblock_makeblock__1201180390 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(RecyclerView.class);
      ((RecyclerView)var1).setItemViewCacheSize(10);
   }
}
