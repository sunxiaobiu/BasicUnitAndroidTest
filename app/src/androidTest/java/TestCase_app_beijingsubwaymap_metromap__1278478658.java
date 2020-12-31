import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_beijingsubwaymap_metromap__1278478658 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Adapter.class);
      Object var1 = EasyMock.createMock(ViewHolder.class);
      ((Adapter)var2).onFailedToRecycleView((ViewHolder)var1);
   }
}
