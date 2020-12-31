import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_teovogel_yip_876628964 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(RecyclerView.class);
      Adapter var3 = ((RecyclerView)var2).getAdapter();
      Object var1 = EasyMock.createMock(ViewHolder.class);
      var3.onBindViewHolder((ViewHolder)var1, 0);
   }
}
