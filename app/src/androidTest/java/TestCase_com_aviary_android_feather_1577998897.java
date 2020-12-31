import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aviary_android_feather_1577998897 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      View var2 = ((View)var1).findViewById(2131952241);
      RecyclerView var3 = (RecyclerView)var2;
      boolean var4 = var3.canScrollVertically(-1);
   }
}
