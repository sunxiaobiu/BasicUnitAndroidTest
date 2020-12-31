import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adriamedia_espreso__1984190705 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      RecyclerView var3 = (RecyclerView)var2;
      byte var1 = 1;
      var3.setScrollBarStyle(var1);
   }
}
