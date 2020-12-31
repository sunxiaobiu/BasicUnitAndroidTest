import android.support.v7.widget.RecyclerView.Adapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_beekeeper_bebeyond__507233989 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Adapter.class);
      byte var1 = 1;
      byte var2 = 1;
      ((Adapter)var3).notifyItemRangeRemoved(var1, var2);
   }
}
