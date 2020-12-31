import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ignacemaes_bpmtap_1203977252 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(RecyclerView.class);
      ViewHolder var2 = ((RecyclerView)var1).findViewHolderForPosition(0);
   }
}
