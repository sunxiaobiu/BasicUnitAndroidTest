import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_beijingsubwaymap_metromap__227249958 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Adapter.class);
      Object var1 = EasyMock.createMock(ViewHolder.class);
      byte var2 = 1;
      Object var3 = null;
      ((Adapter)var4).onBindViewHolder((ViewHolder)var1, var2, (List)var3);
   }
}
