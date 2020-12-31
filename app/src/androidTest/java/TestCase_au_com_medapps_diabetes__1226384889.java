import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_medapps_diabetes__1226384889 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(RecyclerView.class);
      Object var1 = null;
      ((RecyclerView)var2).removeOnScrollListener((OnScrollListener)var1);
   }
}
