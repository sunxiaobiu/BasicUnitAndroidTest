import android.support.v7.widget.RecyclerView.Adapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_weatherzone_android_weatherzonefreeapp_272502152 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Adapter.class);
      boolean var2 = ((Adapter)var1).hasStableIds();
   }
}
