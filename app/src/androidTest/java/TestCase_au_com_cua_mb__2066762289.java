import android.support.v7.widget.RecyclerView.Recycler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__2066762289 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Recycler.class);
      byte var1 = 1;
      ((Recycler)var2).getViewForPosition(var1);
   }
}
