import android.support.v7.widget.RecyclerView.Recycler;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_306634183 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Recycler.class);
      ((Recycler)var1).clear();
   }
}
