import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_beijingsubwaymap_metromap__1257513672 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Adapter.class);
      Object var1 = EasyMock.createMock(RecyclerView.class);
      ((Adapter)var2).onDetachedFromRecyclerView((RecyclerView)var1);
   }
}
