import android.support.v7.widget.StaggeredGridLayoutManager;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_innologica_proofy__1181715431 {
   @Test
   public void testCase() throws Exception {
      StaggeredGridLayoutManager var2 = new StaggeredGridLayoutManager(2, 1);
      byte var1 = 1;
      var2.scrollToPosition(var1);
   }
}
