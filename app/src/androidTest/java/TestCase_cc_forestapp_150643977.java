import android.support.v7.widget.RecyclerView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cc_forestapp_150643977 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(RecyclerView.class);
      int var2 = ((RecyclerView)var1).getPaddingStart();
   }
}
