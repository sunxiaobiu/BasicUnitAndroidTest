import android.support.v7.widget.RecyclerView;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__1465106870 {
   @Test
   public void testCase() throws Exception {
      ArrayList var2 = new ArrayList(1);
      Iterator var3 = var2.iterator();
      Object var4 = var3.next();
      RecyclerView var5 = (RecyclerView)var4;
      byte var1 = 1;
      var5.scrollToPosition(var1);
   }
}
